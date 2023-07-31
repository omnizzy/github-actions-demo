package com.ConvinienceStore.storeWK2.service.implementation;

import com.ConvinienceStore.storeWK2.Enums.Qualification;
import com.ConvinienceStore.storeWK2.Enums.Roles;
import com.ConvinienceStore.storeWK2.model.Applicant;
import com.ConvinienceStore.storeWK2.model.Staff;
import com.ConvinienceStore.storeWK2.service.ManagerServices;

public class ManagerServicesImpl implements ManagerServices {

    @Override
    public String hireApplicant(Staff staff, Applicant applicant) {
        if(staff.getRole().equals(Roles.Manager)){

            if(applicant.getQualification().equals(Qualification.Ssce) && applicant.getAge() > 20){
                return applicant.getName() + " You are hired.";
            }
            return "You are not qualified.";
        }
        return "You are not a manager.";
    }
}
