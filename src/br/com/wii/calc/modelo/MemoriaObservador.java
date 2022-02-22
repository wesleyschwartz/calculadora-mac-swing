package br.com.wii.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
    void valorAlterado(String novoValor);
}
