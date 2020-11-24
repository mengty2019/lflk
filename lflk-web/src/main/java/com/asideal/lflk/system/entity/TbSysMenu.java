package com.asideal.lflk.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 菜单表 
 * </p>
 *
 * @author ZhangJie
 * @since 2020-11-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TbSysMenu对象", description="菜单表 ")
public class TbSysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "菜单ID 菜单ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "菜单名称 菜单名称")
    private String menuName;

    @ApiModelProperty(value = "父级菜单id 父级菜单id")
    private Integer pid;

    @ApiModelProperty(value = "跳转url 跳转路径")
    private String url;

    @ApiModelProperty(value = "菜单内排序 菜单内排序")
    private Integer orderNum;

    @ApiModelProperty(value = "菜单类型 类型，0菜单，1按钮")
    private String type;

    @ApiModelProperty(value = "图标样式 内联样式")
    private String icon;

    @ApiModelProperty(value = "是否可用 0可用，1不可用")
    private String disabled;

    @ApiModelProperty(value = "是否打开 0不展开，1展开")
    private String open;

    @ApiModelProperty(value = "是否是子菜单 0代表不是子菜单，1代表是子菜单")
    private Integer children;

    @ApiModelProperty(value = "创建人id 创建人id")
    private Integer createUserId;

    @ApiModelProperty(value = "创建人名称 创建人姓名")
    private String createUserName;

    @ApiModelProperty(value = "创建时间 创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人id 更新人id")
    private String updateUserId;

    @ApiModelProperty(value = "更新人姓名 更新人姓名")
    private String updateUserName;

    @ApiModelProperty(value = "最后更新时间 最后更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除，0代表逻辑未删除（默认值），1代表逻辑已删除")
    private Integer deleted;

    @ApiModelProperty(value = "是否隐藏，是否隐藏，0代表不隐藏，1代表隐藏")
    private Integer hidden;

    @ApiModelProperty(value = "是否隐藏，是否隐藏，0代表不隐藏，1代表隐藏")
    private String component;

    @ApiModelProperty(value = "前端路径")
    private String path;

    @ApiModelProperty(value = "固钉，0代表不是固钉，1代表是固钉")
    private String affix;


}
