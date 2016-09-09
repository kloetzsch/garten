/*
 * Alle Rechte vorbehalten, Konrad L�tzsch
 * Each line should be prefixed with  * 
 */
package de.konrad.loetzsch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author konrad
 */
@Document
public class CropItem
{
    @Id
    final private Integer id;
    
    final private Variety variety;
    
    final private long date;
    
    final private Integer weight;

    final private Integer amount;

    public CropItem(Integer id, Variety variety, long date, Integer weight, Integer amount)
    {
        if (weight == 0 && amount == 0) {
            throw new IllegalArgumentException(
                    "The CropItem has no defined quantity!");
        }
        this.id = id;
        this.variety = variety;
        this.date = date;
        this.weight = weight;
        this.amount = amount;
    }

    public Variety getVariety()
    {
        return variety;
    }

    public long getDate()
    {
        return date;
    }

    public Integer getWeight()
    {
        return weight;
    }

    public Integer getAmount()
    {
        return amount;
    }
    

    
}
