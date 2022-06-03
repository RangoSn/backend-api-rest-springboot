package com.javademo.demo.service;

import java.util.List;
import java.util.Optional;

import com.javademo.demo.Entity.CuentaEntity;

public interface CuentasService {
    List<CuentaEntity> findAllCuentas();
    Optional<CuentaEntity> findById(Long id);
    CuentaEntity saveCuenta(CuentaEntity cuentaEntity);
    CuentaEntity updateCuenta(CuentaEntity cuentaEntity);
    void deleteCuenta(Long id);
    
    
    
}
