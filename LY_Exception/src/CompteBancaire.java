package src;

class CompteBancaire
{
    private double solde        = 0.0;  // solde du compte
    private double decouvert    = -700; // découvert autorisé
    
    public void retrait(double montant) throws IllegalArgumentException, AutorisationException
    {
        double nouveau = solde - montant;
        if (montant < 0.0){
            throw new IllegalArgumentException("Mauvais montant");
        }
        if (nouveau < decouvert){
            throw new AutorisationException();
        }
        solde = nouveau;  
    }

    public double getSolde()
    {
        return this.solde;
    }

    public double getDecouvert()
    {
        return this.decouvert;
    }


    public void setSolde(double solde)
    {
        this.solde = solde;
    }

    @Override
    public String toString()
    {
        String msg = "Solde : "+solde+" / Decouvert :"+this.decouvert;
        return msg;
    }
}

// si bool (min.) : isGet
// sinon (max.): get