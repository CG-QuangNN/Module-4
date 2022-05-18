package vn.codegym.service;

import vn.codegym.model.MedicalDeclaration;

public interface IService {
    MedicalDeclaration showDeclaredInfor();

    MedicalDeclaration saveInfor(MedicalDeclaration object);
}
