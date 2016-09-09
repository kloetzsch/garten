/*
 * Alle Rechte vorbehalten, Konrad L�tzsch
 * Each line should be prefixed with  * 
 */
package de.konrad.loetzsch.controller.crop;

/**
 *
 * @author konrad
 */
public class CropItemViewModel
{

    private long date;

    private int weight;

    private int amount;

    private String varietyName;

    private String speciesName;

    public long getDate()
    {
        return date;
    }

    public void setDate(long date)
    {
        this.date = date;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public String getVarietyName()
    {
        return varietyName;
    }

    public void setVarietyName(String varietyName)
    {
        this.varietyName = varietyName;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }

    public void setSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }
    
    
}
