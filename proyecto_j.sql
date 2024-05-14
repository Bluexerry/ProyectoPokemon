-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2024 a las 18:54:50
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_j`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`ID`, `Nombre`) VALUES
(1, 'Macho'),
(2, 'Hembra'),
(3, 'NULL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `naturaleza`
--

CREATE TABLE `naturaleza` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Nombre` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `naturaleza`
--

INSERT INTO `naturaleza` (`ID`, `Nombre`) VALUES
(1, 'Activa'),
(2, 'Afable'),
(3, 'Agitada'),
(4, 'Alegre'),
(5, 'Alocada'),
(6, 'Audaz'),
(7, 'Audaz'),
(8, 'Cauta'),
(9, 'Docil'),
(10, 'Firme'),
(11, 'Floja'),
(12, 'Fuerte'),
(13, 'Grosera'),
(14, 'Huraña'),
(15, 'Ingenua'),
(16, 'Mansa'),
(17, 'Miedosa'),
(18, 'Modesta'),
(19, 'Osada'),
(20, 'Picara'),
(21, 'Placida'),
(22, 'Rara'),
(23, 'Serena'),
(24, 'Seria'),
(25, 'Timida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `Num_Pok` int(4) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Genero_id` int(10) UNSIGNED NOT NULL,
  `Tipo1_id` int(10) UNSIGNED NOT NULL,
  `Tipo2_id` int(10) UNSIGNED DEFAULT NULL,
  `Naturaleza_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='Esta tabla contiene campos basicos del elemento "Pokemon".';

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`Num_Pok`, `Nombre`, `Genero_id`, `Tipo1_id`, `Tipo2_id`, `Naturaleza_id`) VALUES
(94, 'Gengar', 1, 9, 14, 17),
(212, 'Scizor', 1, 1, 17, 8),
(302, 'Sableye', 1, 2, 9, 8),
(448, 'Lucario', 1, 6, 17, 4),
(462, 'Magnezone', 3, 4, 17, 17),
(474, 'Porygon-Z', 3, 13, 19, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Nombre` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`ID`, `Nombre`) VALUES
(1, 'Bicho'),
(2, 'Siniestro'),
(3, 'Dragon'),
(4, 'Electrico'),
(5, 'Hada'),
(6, 'Lucha'),
(7, 'Fuego'),
(8, 'Volador'),
(9, 'Fantasma'),
(10, 'Planta'),
(11, 'Tierra'),
(12, 'Hielo'),
(13, 'Normal'),
(14, 'Veneno'),
(15, 'Psiquico'),
(16, 'Roca'),
(17, 'Acero'),
(18, 'Agua'),
(19, 'NULL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(3) NOT NULL,
  `Nombre` varchar(10) NOT NULL,
  `Apellido` varchar(10) NOT NULL,
  `Telefono` varchar(9) NOT NULL,
  `Contrasena` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `Nombre`, `Apellido`, `Telefono`, `Contrasena`) VALUES
(1, 'Jesús', 'Vázquez', '652235643', 'admin27'),
(29, 'Alejandro', 'Ramos', '689574390', 'noadmin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `naturaleza`
--
ALTER TABLE `naturaleza`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`Num_Pok`),
  ADD KEY `FK_pokemon_naturaleza` (`Naturaleza_id`) USING BTREE,
  ADD KEY `FK_pokemon_genero` (`Genero_id`) USING BTREE,
  ADD KEY `FK_pokemon_tipo` (`Tipo1_id`),
  ADD KEY `FK_pokemon_tipo_2` (`Tipo2_id`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD CONSTRAINT `FK_pokemon_genero` FOREIGN KEY (`Genero_id`) REFERENCES `genero` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_pokemon_naturaleza` FOREIGN KEY (`Naturaleza_id`) REFERENCES `naturaleza` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_pokemon_tipo` FOREIGN KEY (`Tipo1_id`) REFERENCES `tipo` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_pokemon_tipo_2` FOREIGN KEY (`Tipo2_id`) REFERENCES `tipo` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
