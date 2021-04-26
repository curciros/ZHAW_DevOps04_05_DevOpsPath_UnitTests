package ch.zhaw.iwi.devops.fizzbuzz;

public class AlterCheck {

    public String alterCheck(int zahl){
        if (zahl <= 12){
            return "Kind";
        }else if (zahl >12 && zahl <= 20){
            return "Teenager";
        }else if (zahl >20 && zahl <=40){
            return "knackig";
        }else if (zahl >40 && zahl <=60){
            return "midlifecrisis";
        }else if (zahl >60){
            return "pensioniert";
        }
        return "undefinierbar";
    }
    
}
