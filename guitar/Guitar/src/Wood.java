public enum Wood {

    MAHOGANY,ALDER,CEDER;

    public String toString()
    {
        switch(this)
        {
            case CEDER: return "CEDER";
            case MAHOGANY: return "MAHOGANY";
            case ALDER: return "Alder";
            default: return "CEDER";
        }
    }
}
