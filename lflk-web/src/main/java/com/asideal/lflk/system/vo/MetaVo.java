package com.asideal.lflk.system.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 组件Meta属性
 * @author ZhangJie
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="组件meta属性", description="组件中meta属性设置")
public class MetaVo {
    @ApiModelProperty(value = "页面title")
    private String title;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "是否为固钉")
    private Boolean affix;
}
