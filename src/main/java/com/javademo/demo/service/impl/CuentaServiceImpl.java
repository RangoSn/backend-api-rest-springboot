package com.javademo.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javademo.demo.Entity.CuentaEntity;
import com.javademo.demo.repository.CuentaRepository;
import com.javademo.demo.service.CuentasService;

@Service
public class CuentaServiceImpl implements CuentasService{
    private final CuentaRepository cuentaRepository;
    public CuentaServiceImpl(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @Override
    public List<CuentaEntity> findAllCuentas() {
        // TODO Auto-generated method stub
        return cuentaRepository.findAll();
    }

    @Override
    public Optional<CuentaEntity> findById(Long id) {
        // TODO Auto-generated method stub
        return cuentaRepository.findById(id);
    }

    @Override
    public CuentaEntity saveCuenta(CuentaEntity cuentaEntity) {
        // TODO Auto-generated method stub
        return cuentaRepository.save(cuentaEntity);
    }

    @Override
    public CuentaEntity updateCuenta(CuentaEntity cuentaEntity) {
        // TODO Auto-generated method stub
        return cuentaRepository.save(cuentaEntity);
    }

    @Override
    public void deleteCuenta(Long id) {
        // TODO Auto-generated method stub
        cuentaRepository.deleteById(id);
    }
    
}
