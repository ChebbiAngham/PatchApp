package com.os.patches.service;

import com.os.patches.model.PatchDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatchService {

    List<PatchDTO> findAllPatches();

}
