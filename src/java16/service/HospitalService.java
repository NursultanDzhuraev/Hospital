package java16.service;

import java16.models.Hospital;
import java16.models.Patient;

import java.util.List;
import java.util.Map;

public interface HospitalService {
    String addHospital(Hospital hospital);

    Hospital findHospitalById(Long id);

    List<Hospital> getAllHospital();

    List<Patient> getAllPatientFromHospital(Long id);

    String deleteHospitalById(Long id);

    Map<String, Hospital> getAllHospitalByAddress(String address);
}
