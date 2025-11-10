package com.sena.springecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.springecommerce.model.DetalleOrden;

@Service
public class DetalleOrdenServiceImplement implements IDetalleOrdenService{
	
	@Autowired
	private IDetalleOrdenService detalleOrdenRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.save(detalleOrden);
	}
	
}
