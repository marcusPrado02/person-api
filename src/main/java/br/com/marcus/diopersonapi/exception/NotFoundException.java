package br.com.marcusprado.diopersonapi.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Long id) {
        super(String.format("Resource with id %d not found", id));
    }
}
