package com.challenge.rest.domain.topicos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findByActivoTrue(Pageable paginacion);

    @Query("SELECT t FROM Topico t WHERE t.curso = :curso AND YEAR(t.fecha) = :year AND t.activo = true")
    Page<Topico> buscarPorCursoYAño(@Param("curso") String curso, @Param("year") int year, Pageable pageable);

}
