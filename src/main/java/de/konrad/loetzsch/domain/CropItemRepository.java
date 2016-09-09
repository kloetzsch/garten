/*
 * Alle Rechte vorbehalten, Konrad L�tzsch
 * Each line should be prefixed with  * 
 */
package de.konrad.loetzsch.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author konrad
 */
public interface CropItemRepository extends MongoRepository<CropItem, Integer>
{
    
}
