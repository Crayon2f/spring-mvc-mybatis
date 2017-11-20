<#macro html_head title>
<!DOCTYPE html>
<html lang="en">
<head>
    <#nested >
    <title>${title}</title>
</head>
</#macro>
<#macro html_body>
<body>
    <#nested >
</#macro>
<#macro html_script>
    <#nested >
</body>
</html>
</#macro>