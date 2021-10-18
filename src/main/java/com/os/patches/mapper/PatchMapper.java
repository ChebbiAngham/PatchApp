package com.os.patches.mapper;

import com.os.patches.entity.PatchRedhat;
import com.os.patches.model.PatchDTO;
import org.springframework.stereotype.Component;

@Component
public class PatchMapper {

    public PatchDTO FromEntity(PatchRedhat patchRedhat){
        PatchDTO patchDTO = new PatchDTO();
        patchDTO.setdate(patchRedhat.getdate());
        patchDTO.setPatch_name(patchRedhat.getPatch_name());
        patchDTO.setProduct_name(patchRedhat.getProduct_name());
        patchDTO.setSeverity(patchRedhat.getSeverity());






        return patchDTO;
    }


}
