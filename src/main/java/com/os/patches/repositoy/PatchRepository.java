package com.os.patches.repositoy;

import com.os.patches.entity.PatchRedhat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatchRepository extends JpaRepository<PatchRedhat, Long>{

}
