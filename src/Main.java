public class Main {
    public static void main(String[] args) {
        //Create weapon;
        Gun m4a1 = new M4A1();
        Gun short_gun = new Shortgun();

        //Create player
        Player player1 = new Player("Henry",m4a1);
        Player player2 = new Player("Jonathan",short_gun);

        // First status
        player1.PlayerStatus();
        player2.PlayerStatus();

        //Starting game
        System.out.println("Player: "+player1.getName()+ " fired player: "+player2.getName());
        player1.fire(player2);
        System.out.println("Player: "+player2.getName()+ " fired player: "+player1.getName());
        player2.fire(player1);

        // Kiểm tra trạng thái
        System.out.println("\nFinal Health Status:");
        player1.PlayerStatus();
        player2.PlayerStatus();

        //Continue game
        System.out.println("Player: "+player1.getName()+ " fired player: "+player2.getName());
        player1.fire(player2);
        System.out.println("Player: "+player2.getName()+ " fired player: "+player1.getName());
        player2.fire(player1);

        // Kiểm tra trạng thái
        System.out.println("\nFinal Health Status:");
        player1.PlayerStatus();
        player2.PlayerStatus();

    }
}