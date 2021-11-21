package com.fantasytextil.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fantasytextil.model.PedidoCortador;

public interface IPedidoCortadorRepo  extends IGenericRepo<PedidoCortador, Integer>{
	
	@Modifying
	@Query(value = "INSERT INTO pedido_cortador(id_pedido, id_cortador) VALUES (:idPedido, :idCortador)",
																					nativeQuery = true)
	Integer registrar(@Param("idPedido") Integer idPedido, @Param("idCortador") Integer idCortador);
}
