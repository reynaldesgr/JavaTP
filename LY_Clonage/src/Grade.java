enum Grade
    {
        TROOPER("Simple Soldat", "BLANC"),
        SERGENT("Sergent", "VERT"),
        LIEUTNANT("Lieutenant", "BLEU"),
        CAPITAINE("Capitaine", "ROUGE"),
        COMMANDANT("Commandant", "JAUNE");

        private String nom;
        private String couleur;

        Grade(String nom, String couleur)
        {
            this.nom     = nom;
            this.couleur = couleur;
        }

    }