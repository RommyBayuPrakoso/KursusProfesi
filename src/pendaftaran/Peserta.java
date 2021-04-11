
package pendaftaran;

public class Peserta {
    public String cekKelayakan(int nilaiMatematika, int nilaiFisika, int nilaiKimia){
    
    String kelayakan = "layakIkutKhursus";
    
    if((nilaiMatematika >= 65 && nilaiFisika >= 55 && nilaiKimia >= 50) || (nilaiMatematika + nilaiFisika + nilaiKimia >= 190) || (nilaiMatematika + nilaiFisika >= 140)){
    }else{
        kelayakan = "tidakLayakIkutKhursus";

    } 
    return kelayakan;
        
    }   
}
