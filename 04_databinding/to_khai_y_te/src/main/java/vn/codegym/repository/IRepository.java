package vn.codegym.repository;

import vn.codegym.model.MedicalDeclaration;

public interface IRepository {
    MedicalDeclaration showDeclaredInfor();

    MedicalDeclaration saveInfor(MedicalDeclaration object);
}
