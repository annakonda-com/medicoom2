package ru.medicoom.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val lightScheme = lightColorScheme(
    primary = _root_ide_package_.ru.medicoom.ui.theme.primaryLight,
    onPrimary = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryLight,
    primaryContainer = _root_ide_package_.ru.medicoom.ui.theme.primaryContainerLight,
    onPrimaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryContainerLight,
    secondary = _root_ide_package_.ru.medicoom.ui.theme.secondaryLight,
    onSecondary = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryLight,
    secondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.secondaryContainerLight,
    onSecondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryContainerLight,
    tertiary = _root_ide_package_.ru.medicoom.ui.theme.tertiaryLight,
    onTertiary = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryLight,
    tertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.tertiaryContainerLight,
    onTertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryContainerLight,
    error = _root_ide_package_.ru.medicoom.ui.theme.errorLight,
    onError = _root_ide_package_.ru.medicoom.ui.theme.onErrorLight,
    errorContainer = _root_ide_package_.ru.medicoom.ui.theme.errorContainerLight,
    onErrorContainer = _root_ide_package_.ru.medicoom.ui.theme.onErrorContainerLight,
    background = _root_ide_package_.ru.medicoom.ui.theme.backgroundLight,
    onBackground = _root_ide_package_.ru.medicoom.ui.theme.onBackgroundLight,
    surface = _root_ide_package_.ru.medicoom.ui.theme.surfaceLight,
    onSurface = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceLight,
    surfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.surfaceVariantLight,
    onSurfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceVariantLight,
    outline = _root_ide_package_.ru.medicoom.ui.theme.outlineLight,
    outlineVariant = _root_ide_package_.ru.medicoom.ui.theme.outlineVariantLight,
    scrim = _root_ide_package_.ru.medicoom.ui.theme.scrimLight,
    inverseSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseSurfaceLight,
    inverseOnSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseOnSurfaceLight,
    inversePrimary = _root_ide_package_.ru.medicoom.ui.theme.inversePrimaryLight,
    surfaceDim = _root_ide_package_.ru.medicoom.ui.theme.surfaceDimLight,
    surfaceBright = _root_ide_package_.ru.medicoom.ui.theme.surfaceBrightLight,
    surfaceContainerLowest = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerLowestLight,
    surfaceContainerLow = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerLowLight,
    surfaceContainer = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerLight,
    surfaceContainerHigh = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerHighLight,
    surfaceContainerHighest = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = _root_ide_package_.ru.medicoom.ui.theme.primaryDark,
    onPrimary = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryDark,
    primaryContainer = _root_ide_package_.ru.medicoom.ui.theme.primaryContainerDark,
    onPrimaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryContainerDark,
    secondary = _root_ide_package_.ru.medicoom.ui.theme.secondaryDark,
    onSecondary = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryDark,
    secondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.secondaryContainerDark,
    onSecondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryContainerDark,
    tertiary = _root_ide_package_.ru.medicoom.ui.theme.tertiaryDark,
    onTertiary = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryDark,
    tertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.tertiaryContainerDark,
    onTertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryContainerDark,
    error = _root_ide_package_.ru.medicoom.ui.theme.errorDark,
    onError = _root_ide_package_.ru.medicoom.ui.theme.onErrorDark,
    errorContainer = _root_ide_package_.ru.medicoom.ui.theme.errorContainerDark,
    onErrorContainer = _root_ide_package_.ru.medicoom.ui.theme.onErrorContainerDark,
    background = _root_ide_package_.ru.medicoom.ui.theme.backgroundDark,
    onBackground = _root_ide_package_.ru.medicoom.ui.theme.onBackgroundDark,
    surface = _root_ide_package_.ru.medicoom.ui.theme.surfaceDark,
    onSurface = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceDark,
    surfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.surfaceVariantDark,
    onSurfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceVariantDark,
    outline = _root_ide_package_.ru.medicoom.ui.theme.outlineDark,
    outlineVariant = _root_ide_package_.ru.medicoom.ui.theme.outlineVariantDark,
    scrim = _root_ide_package_.ru.medicoom.ui.theme.scrimDark,
    inverseSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseSurfaceDark,
    inverseOnSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseOnSurfaceDark,
    inversePrimary = _root_ide_package_.ru.medicoom.ui.theme.inversePrimaryDark,
    surfaceDim = _root_ide_package_.ru.medicoom.ui.theme.surfaceDimDark,
    surfaceBright = _root_ide_package_.ru.medicoom.ui.theme.surfaceBrightDark,
    surfaceContainerLowest = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerLowestDark,
    surfaceContainerLow = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerLowDark,
    surfaceContainer = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerDark,
    surfaceContainerHigh = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerHighDark,
    surfaceContainerHighest = _root_ide_package_.ru.medicoom.ui.theme.surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = _root_ide_package_.ru.medicoom.ui.theme.primaryLightMediumContrast,
    onPrimary = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryLightMediumContrast,
    primaryContainer = _root_ide_package_.ru.medicoom.ui.theme.primaryContainerLightMediumContrast,
    onPrimaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onPrimaryContainerLightMediumContrast,
    secondary = _root_ide_package_.ru.medicoom.ui.theme.secondaryLightMediumContrast,
    onSecondary = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryLightMediumContrast,
    secondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.secondaryContainerLightMediumContrast,
    onSecondaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onSecondaryContainerLightMediumContrast,
    tertiary = _root_ide_package_.ru.medicoom.ui.theme.tertiaryLightMediumContrast,
    onTertiary = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryLightMediumContrast,
    tertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.tertiaryContainerLightMediumContrast,
    onTertiaryContainer = _root_ide_package_.ru.medicoom.ui.theme.onTertiaryContainerLightMediumContrast,
    error = _root_ide_package_.ru.medicoom.ui.theme.errorLightMediumContrast,
    onError = _root_ide_package_.ru.medicoom.ui.theme.onErrorLightMediumContrast,
    errorContainer = _root_ide_package_.ru.medicoom.ui.theme.errorContainerLightMediumContrast,
    onErrorContainer = _root_ide_package_.ru.medicoom.ui.theme.onErrorContainerLightMediumContrast,
    background = _root_ide_package_.ru.medicoom.ui.theme.backgroundLightMediumContrast,
    onBackground = _root_ide_package_.ru.medicoom.ui.theme.onBackgroundLightMediumContrast,
    surface = _root_ide_package_.ru.medicoom.ui.theme.surfaceLightMediumContrast,
    onSurface = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceLightMediumContrast,
    surfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.surfaceVariantLightMediumContrast,
    onSurfaceVariant = _root_ide_package_.ru.medicoom.ui.theme.onSurfaceVariantLightMediumContrast,
    outline = _root_ide_package_.ru.medicoom.ui.theme.outlineLightMediumContrast,
    outlineVariant = _root_ide_package_.ru.medicoom.ui.theme.outlineVariantLightMediumContrast,
    scrim = _root_ide_package_.ru.medicoom.ui.theme.scrimLightMediumContrast,
    inverseSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseSurfaceLightMediumContrast,
    inverseOnSurface = _root_ide_package_.ru.medicoom.ui.theme.inverseOnSurfaceLightMediumContrast,
    inversePrimary = _root_ide_package_.ru.medicoom.ui.theme.inversePrimaryLightMediumContrast,
    surfaceDim = _root_ide_package_.ru.medicoom.ui.theme.surfaceDimLightMediumContrast,
    surfaceBright = _root_ide_package_.ru.medicoom.ui.theme.surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun Medicoom2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Medicoom2Typography,
        content = content
    )
}
