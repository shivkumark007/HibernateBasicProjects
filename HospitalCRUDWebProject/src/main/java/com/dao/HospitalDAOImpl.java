package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Hospital;
import com.utility.HibernateUtility;

public class HospitalDAOImpl implements HospitalDAO {

    @Override
    public int insertPatient(Hospital hospital) {
        int i = 0;
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(hospital);
            tx.commit();
            i = 1;
        } catch (Exception e) {
            System.out.println("HospitalDAOImpl insertPatient: " + e);
        }
        return i;
    }

    @Override
    public int deletePatient(int id) {
        int i = 0;
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Hospital hospital = session.get(Hospital.class, id);
            if (hospital != null) {
                session.delete(hospital);
                tx.commit();
                i = 1;
            }
        } catch (Exception e) {
            System.out.println("HospitalDAOImpl deletePatient: " + e);
        }
        return i;
    }

    @Override
    public int updatePatient(Hospital hospital) {
        int i = 0;
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Hospital hos = session.get(Hospital.class, hospital.getId());
            if (hos != null) {
                hos.setName(hospital.getName());
                hos.setEmail(hospital.getEmail());
                hos.setDate(hospital.getDate());
                hos.setDrname(hospital.getDrname());
                hos.setSymptoms(hospital.getSymptoms());
                session.update(hos);
                tx.commit();
                i = 1;
            }
        } catch (Exception e) {
            System.out.println("HospitalDAOImpl updatePatient: " + e);
        }
        return i;
    }

    @Override
    public Hospital getPatientById(int id) {
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            Hospital hospital = session.get(Hospital.class, id);
            return hospital;
        } catch (Exception e) {
            System.out.println("HospitalDAOImpl Get patient By Id: " + e);
        }
        return null;
    }

    @Override
    public List<Hospital> getAllPatients() {
        List<Hospital> hosList = new ArrayList<Hospital>();
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            Query<Hospital> query = session.createQuery("from Hospital", Hospital.class);
            hosList = query.list();
        } catch (Exception e) {
            System.out.println("HospitalDAOImpl Get All Patients: " + e);
        }
        return hosList;
    }
}
