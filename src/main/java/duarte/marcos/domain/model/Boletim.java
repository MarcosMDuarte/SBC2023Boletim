package duarte.marcos.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "tb_boletim")
public class Boletim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String anoLetivo;
    private BigDecimal notaMatematica;
    private BigDecimal notaPortugues;
    private BigDecimal notaCiencias;
    private BigDecimal notaHistoria;
    private BigDecimal notaGeografia;
    private BigDecimal frequenciaMatematica;
    private BigDecimal frequenciaPortugues;
    private BigDecimal frequenciaCiencias;
    private BigDecimal frequenciaHistoria;
    private BigDecimal frequenciaGeografia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public BigDecimal getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(BigDecimal notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public BigDecimal getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(BigDecimal notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public BigDecimal getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(BigDecimal notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public BigDecimal getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(BigDecimal notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public BigDecimal getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(BigDecimal notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public BigDecimal getFrequenciaMatematica() {
        return frequenciaMatematica;
    }

    public void setFrequenciaMatematica(BigDecimal frequenciaMatematica) {
        this.frequenciaMatematica = frequenciaMatematica;
    }

    public BigDecimal getFrequenciaPortugues() {
        return frequenciaPortugues;
    }

    public void setFrequenciaPortugues(BigDecimal frequenciaPortugues) {
        this.frequenciaPortugues = frequenciaPortugues;
    }

    public BigDecimal getFrequenciaCiencias() {
        return frequenciaCiencias;
    }

    public void setFrequenciaCiencias(BigDecimal frequenciaCiencias) {
        this.frequenciaCiencias = frequenciaCiencias;
    }

    public BigDecimal getFrequenciaHistoria() {
        return frequenciaHistoria;
    }

    public void setFrequenciaHistoria(BigDecimal frequenciaHistoria) {
        this.frequenciaHistoria = frequenciaHistoria;
    }

    public BigDecimal getFrequenciaGeografia() {
        return frequenciaGeografia;
    }

    public void setFrequenciaGeografia(BigDecimal frequenciaGeografia) {
        this.frequenciaGeografia = frequenciaGeografia;
    }
}
