class Saudacao {
    public static void main(String[] args) {
        int hora = 23; // Pode mudar o valor para testar diferentes horários
        String mensagem = obterSaudacao(hora);

        System.out.println(mensagem);
    }

    // Método modularizado para obter a saudação com base na hora
    public static String obterSaudacao(int hora) {
        if (hora >= 6 && hora < 12) {
            return "Bom dia!";
        } else if (hora >= 12 && hora < 18) {
            return "Boa tarde!";
        } else {
            return "Boa noite!";
        }
    }
}