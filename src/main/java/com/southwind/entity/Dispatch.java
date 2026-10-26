package com.southwind.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
  @EqualsAndHashCode(callSuper = false)
    public class Dispatch implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 运营人员编号
     */
      private Integer aid;

      /**
     * 调度内容
     */
      private String content;

  @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
