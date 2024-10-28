public class Main {
    public static void main(String[] args) {
        int idade = 20;
        Integer idadeWrapper = idade;
        Long idadeLong = Long.valueOf(idadeWrapper);
        short idadeShort = (short) idade;
    }
}