package com.challenge.rest.domain.topicos;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,
                                   String titulo,
                                   String mensaje,
                                   LocalDateTime fecha,
                                   String status,
                                   String autor,
                                   String curso) {
}
