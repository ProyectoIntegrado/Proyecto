-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-05-2020 a las 22:00:40
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `saloscar`
--
CREATE DATABASE IF NOT EXISTS `saloscar` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `saloscar`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codCliente` int(4) NOT NULL,
  `dniCliente` varchar(6) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(25) NOT NULL,
  `apellido2` varchar(25) NOT NULL,
  `tlf` int(9) NOT NULL,
  `direccion` varchar(25) NOT NULL,
  `poblacion` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `codEmpleado` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cochealquiler`
--

CREATE TABLE `cochealquiler` (
  `codAlquiler` int(4) NOT NULL,
  `matriculaAlquiler` varchar(6) NOT NULL,
  `codCliente` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cocheventa`
--

CREATE TABLE `cocheventa` (
  `codCoche` int(4) NOT NULL,
  `matriculaCoche` varchar(6) NOT NULL,
  `modelo` varchar(25) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `color` varchar(25) NOT NULL,
  `puertas` int(1) NOT NULL,
  `fechaMatriculacion` date NOT NULL,
  `codCliente` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `codEmpleado` int(4) NOT NULL,
  `dniEmpleado` varchar(9) NOT NULL,
  `password` int(4) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(25) NOT NULL,
  `apellido2` varchar(25) NOT NULL,
  `tlf` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fechaalquiler`
--

CREATE TABLE `fechaalquiler` (
  `fechaSalida` date NOT NULL,
  `FechaEntrada` date NOT NULL,
  `codCliente` int(4) NOT NULL,
  `codAlquiler` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparaciones`
--

CREATE TABLE `reparaciones` (
  `codReparacion` int(4) NOT NULL,
  `matriculaReparacion` varchar(6) NOT NULL,
  `fechaSalida` date NOT NULL,
  `fechaEntrada` date NOT NULL,
  `pintura` tinyint(1) NOT NULL,
  `ruedas` tinyint(1) NOT NULL,
  `filtro` tinyint(1) NOT NULL,
  `frenos` tinyint(1) NOT NULL,
  `aceite` tinyint(1) NOT NULL,
  `bujias` tinyint(1) NOT NULL,
  `codCoche` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codCliente`),
  ADD KEY `codEmpleado` (`codEmpleado`);

--
-- Indices de la tabla `cochealquiler`
--
ALTER TABLE `cochealquiler`
  ADD PRIMARY KEY (`codAlquiler`),
  ADD KEY `codCliente` (`codCliente`);

--
-- Indices de la tabla `cocheventa`
--
ALTER TABLE `cocheventa`
  ADD PRIMARY KEY (`codCoche`),
  ADD KEY `codCliente` (`codCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`codEmpleado`);

--
-- Indices de la tabla `fechaalquiler`
--
ALTER TABLE `fechaalquiler`
  ADD KEY `codCliente` (`codCliente`,`codAlquiler`),
  ADD KEY `codAlquiler` (`codAlquiler`);

--
-- Indices de la tabla `reparaciones`
--
ALTER TABLE `reparaciones`
  ADD PRIMARY KEY (`codReparacion`),
  ADD KEY `codCoche` (`codCoche`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codCliente` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cochealquiler`
--
ALTER TABLE `cochealquiler`
  MODIFY `codAlquiler` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cocheventa`
--
ALTER TABLE `cocheventa`
  MODIFY `codCoche` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `codEmpleado` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reparaciones`
--
ALTER TABLE `reparaciones`
  MODIFY `codReparacion` int(4) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`codEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cochealquiler`
--
ALTER TABLE `cochealquiler`
  ADD CONSTRAINT `cochealquiler_ibfk_1` FOREIGN KEY (`codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cocheventa`
--
ALTER TABLE `cocheventa`
  ADD CONSTRAINT `cocheventa_ibfk_1` FOREIGN KEY (`codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `fechaalquiler`
--
ALTER TABLE `fechaalquiler`
  ADD CONSTRAINT `fechaalquiler_ibfk_1` FOREIGN KEY (`codAlquiler`) REFERENCES `cochealquiler` (`codAlquiler`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fechaalquiler_ibfk_2` FOREIGN KEY (`codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reparaciones`
--
ALTER TABLE `reparaciones`
  ADD CONSTRAINT `reparaciones_ibfk_1` FOREIGN KEY (`codCoche`) REFERENCES `cocheventa` (`codCoche`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
