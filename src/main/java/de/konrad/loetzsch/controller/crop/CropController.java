/*
 * Alle Rechte vorbehalten, Konrad Lï¿½tzsch
 * Each line should be prefixed with  * 
 */
package de.konrad.loetzsch.controller.crop;

import de.konrad.loetzsch.domain.CropItem;
import de.konrad.loetzsch.domain.CropItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author konrad
 */
@RequestMapping("crop")
@Controller
public class CropController
{
    
    private final CropItemRepository cropItemRepository;
    
    @Autowired
    public CropController(CropItemRepository cropItemRepository) {
        this.cropItemRepository = cropItemRepository;
    }
    
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String getCropItemForm(Model model)
    {
        CropItemViewModel cropItemViewModel = new CropItemViewModel();
        cropItemViewModel.setSpeciesName("Anana");
        model.addAttribute("cropItemViewModel", cropItemViewModel);
        return "cropForm";
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String getCropItemForm(Model model, CropItemViewModel cropItemViewModel)
    {
        System.out.println(cropItemViewModel.getSpeciesName());
        model.addAttribute("cropItemViewModel", new CropItemViewModel());
        return "cropForm";
    }
    
    @RequestMapping("")
    public String getCropItemOverView(Model model)
    {
        List<CropItem> cropItemList = this.cropItemRepository.findAll();
        model.addAttribute("cropItemList", cropItemList);
        return "cropItemList";
    }
}
