package com.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 刘文成
 * @since 2023-05-25
 */
@Getter
@Setter
  @TableName("WORKER_NODE")
public class WorkerNode implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String hostName;

    private String port;

    private Integer type;

    private LocalDate launchDate;

    private LocalDateTime modified;

    private LocalDateTime created;


}
