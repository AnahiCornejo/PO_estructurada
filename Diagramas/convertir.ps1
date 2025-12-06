Get-ChildItem -Path $PSScriptRoot -Filter "*.dot" | ForEach-Object {
    $pngName = $_.BaseName + ".png"
    Write-Host "Convirtiendo: $($_.Name) -> $pngName"
    dot -Tpng $_.FullName -o (Join-Path $PSScriptRoot $pngName)
}
Write-Host "¡Conversión completada!"
