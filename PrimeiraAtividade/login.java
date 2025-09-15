package PrimeiraAtividade;

import javax.swing.JOptionPane;

public class login {
   public static void main(String[] args){
    // Login 
    String loginCorreto = "java8";
    String senhaCorreta = "java8";
    boolean loginSucesso = false;
    // Teste de Login para ver se está batendo + quantas quantidades restantes
    for (int i = 1; i <= 3; i++) {
        String loginUsuario = JOptionPane.showInputDialog("Digite seu e-mail");
        String senhaUsuario = JOptionPane.showInputDialog("Digite sua senha");

        if (loginUsuario.equals(loginCorreto) && senhaUsuario.equalsIgnoreCase(senhaCorreta)){
            JOptionPane.showMessageDialog(null, "Acesso concedido!");
            loginSucesso = true;
            break;
        } else if (loginUsuario.equals(loginCorreto) == false || senhaUsuario.equals(senhaCorreta)) {
            JOptionPane.showMessageDialog(null, "Login/senha incorretos! Restam " + (3 - i) + " tentativas");
        }
    }
    if (loginSucesso == false){ JOptionPane.showMessageDialog(null, "Sistema bloqueado, 3 tentativas incorretas");  }
}
}
