module chounion.leaderboard {
    requires javafx.controls;
    requires javafx.fxml;

    opens chounion.leaderboard to javafx.fxml;
    exports chounion.leaderboard;
}
