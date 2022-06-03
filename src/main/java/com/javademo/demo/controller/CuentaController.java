package com.javademo.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.demo.Entity.CuentaEntity;
import com.javademo.demo.service.CuentasService;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {    
    private final CuentasService cuentasService;    
    public CuentaController(CuentasService cuentasService) {
        this.cuentasService = cuentasService;
    }    
    @GetMapping
    public List<CuentaEntity> findAllCuentas(){
        return cuentasService.findAllCuentas();
    }
    @GetMapping("/{id}")
    public Optional<CuentaEntity> findCuentaById(@PathVariable("id") Long id){
        return cuentasService.findById(id);
    }
    @PostMapping
    public CuentaEntity saveCuenta(@RequestBody CuentaEntity cuentaEntity){
        return cuentasService.saveCuenta(cuentaEntity);
    }
    @PutMapping
    public CuentaEntity updateCuenta(@RequestBody CuentaEntity cuentaEntity){
        return cuentasService.updateCuenta(cuentaEntity);
    }
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteCuenta(@PathVariable("id") Long id){
        cuentasService.deleteCuenta(id);        
    }


}
