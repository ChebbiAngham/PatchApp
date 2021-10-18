package com.os.patches.controller;

import com.os.patches.model.PatchDTO;
import com.os.patches.service.PatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patch")
public class PatchesController {

@Autowired
private PatchService patchService;



	@GetMapping("/findAll")
	public List<PatchDTO> findAllPatches(){
	    return patchService.findAllPatches();
    }
}
