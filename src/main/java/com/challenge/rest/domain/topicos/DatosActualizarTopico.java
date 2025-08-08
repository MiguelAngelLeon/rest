package com.challenge.rest.domain.topicos;

import java.time.LocalDateTime;

public record DatosActualizarTopico(String titulo,
                                    String mensaje,
                                    String status,
                                    String autor,
                                    String curso) {
}
