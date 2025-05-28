public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;

    @Override
    public void log(User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if (userIsAdmin) {
            System.out.println("Has access to the website in admin mode");
        }
        super.log(user);  // Esto asegura que la lógica de la clase base también se ejecute
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        return true;
    }
}

