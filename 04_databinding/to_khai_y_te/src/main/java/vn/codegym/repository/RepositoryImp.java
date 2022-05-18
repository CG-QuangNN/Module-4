package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.MedicalDeclaration;

@Repository
public class RepositoryImp implements IRepository{

    private static MedicalDeclaration medicalDeclaration = null;
    @Override
    public MedicalDeclaration showDeclaredInfor() {
        return medicalDeclaration ;
    }

    @Override
    public MedicalDeclaration saveInfor(MedicalDeclaration object) {
        return medicalDeclaration = object;
    }
}
