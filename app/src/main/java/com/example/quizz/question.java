package com.example.quizz;

public class question {
    String pregunta,respuesta,btn1,btn2,btn3;
    public question(String pregunta,String respuesta, String btn1, String btn2, String btn3){
        this.pregunta=pregunta;
        this.respuesta=respuesta;
        this.btn1=btn1;
        this.btn2=btn2;
        this.btn3=btn3;

    }
  public String getPregunta(){return pregunta;}
  public void setPregunta(String pregunta){this.pregunta=pregunta;}

    public String getRespuesta(){return respuesta;}
    public void setRespuesta(String respuesta){this.respuesta=respuesta;}

    public String getBtn1(){return btn1;}
    public void setBtn1(String btn1){this.btn1=btn1;}

    public String getBtn2(){return btn2;}
    public void setBtn2(String btn2){this.btn2=btn2;}

    public String getBtn3(){return btn3;}
    public void setbtn3(String btn3){this.btn3=btn3;}






}
