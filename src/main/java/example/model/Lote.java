package example.model;

public class Lote {
    private int id;
    private int lote;
    private String tipo;
    private int  cor;
    private float nMetrico;
    private String operador;

    public Lote(){}

    public int getLote(){return lote;}
    public void setLote(int lote){this.lote=lote;}
    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo=tipo;}
    public  int getCor(){return cor;}
    public void setCor(int cor){this.cor=cor;}
    public  float getnMetrico(){return nMetrico;}
    public void  setnMetrico(float nMetrico){this.nMetrico=nMetrico;}
    public String getoperador(){return operador;}
    public void setoperador(String operador){this.operador=operador;}

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
}
