package com.os.patches.serviceImpl;

import com.os.patches.mapper.PatchMapper;
import com.os.patches.model.PatchDTO;
import com.os.patches.repositoy.PatchRepository;
import com.os.patches.service.PatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatchServiceImpl implements PatchService {

    @Autowired
    private PatchRepository patchRepository;

    @Autowired
    private PatchMapper mapper;

    @Override
    public List<PatchDTO> findAllPatches() {
        return patchRepository.findAll().stream().map(patchRedhat -> mapper.FromEntity(patchRedhat) ).collect(Collectors.toList());

    }
}
