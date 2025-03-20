package com.siwy.lukas.work;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/work")
public class WorkController {

    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    public String showForm(Model model, @RequestParam(defaultValue = "0") int timeGroup) {
        model.addAttribute("selectedGroup", timeGroup);
        return "work/index";
    }

    @PostMapping("/submitCheckboxes")
    public String submitForm(@RequestParam Map<String, String> allParams, Model model) {
        // Handle submitted checkbox values here
        int selectedGroup = Integer.parseInt(allParams.get("timeGroup"));
        model.addAttribute("selectedGroup", selectedGroup);

        return "work/checkboxResult";
    }
}
