import javax.swing.JOptionPane;

public class IfEncadeado {

    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));


        // maior que 7 aprovado 
        // menor que 7 reprovado 


        if (nota >= 7){
            JOptionPane.showMessageDialog(null, "aprovado");
            
        }else if (nota <= 5 && nota < 7 ){System.err.println("Recuperacao");
    }
            
        else{
             JOptionPane.showMessageDialog(null , "Reprovado");
    
        }
        
    }
    
}
