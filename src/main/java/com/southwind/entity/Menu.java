package com.southwind.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
  @EqualsAndHashCode(callSuper = false)
    public class Menu implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String title;

    private String href;

      /**
     * 0不展开1展开
     */
      private Integer spread;

    private String icon;


}
