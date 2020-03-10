package week04.dao;

class DAOLauncher {
    public static void main(String[] args) {
        Model model01 = new Model("Model 1");
        Model model02 = new Model("Model 2");

        ModelDAO modelDAO = new ModelDAO();

        modelDAO.addOrUpdate(model01);
        modelDAO.save(model02);


        System.out.println(modelDAO.get(1));
        System.out.println(modelDAO.getAll());

        System.out.println(modelDAO.get(10));

    }
}
