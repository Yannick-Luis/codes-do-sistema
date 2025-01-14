-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2025 at 12:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cadastro_funcionario`
--

-- --------------------------------------------------------

--
-- Table structure for table `credenciais`
--

CREATE TABLE `credenciais` (
  `id` int(11) NOT NULL,
  `Cargo` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `credenciais`
--

INSERT INTO `credenciais` (`id`, `Cargo`) VALUES
(1, 'Tecnico IT'),
(2, 'Contabilista'),
(3, 'Cozinheira'),
(4, 'Secretaria'),
(5, 'Desenvolvedor'),
(6, 'Motorista');

-- --------------------------------------------------------

--
-- Table structure for table `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(12) NOT NULL,
  `Nome` varchar(60) NOT NULL,
  `Sobrenome` varchar(60) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Telefone` int(30) NOT NULL,
  `Cargo` varchar(25) NOT NULL,
  `Bairro` varchar(20) NOT NULL,
  `Numero_Casa` varchar(20) NOT NULL,
  `Data_Nascimento` date NOT NULL,
  `Credenciais_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `Nome`, `Sobrenome`, `Email`, `Telefone`, `Cargo`, `Bairro`, `Numero_Casa`, `Data_Nascimento`, `Credenciais_id`) VALUES
(1, 'Mateus', 'Agusto Timo', 'Timomateus@gmail.com', 833434672, 'Motorista', 'Albazine', '554', '2014-08-10', 1),
(2, 'Anizia', 'Custodio Cao', 'Anizia234@gmail.com', 847234901, 'Tecnico IT', 'Boane', '232', '1999-05-03', 2),
(3, 'Batilio', 'Litolia Nhau', 'Nhaulito12@gmail.com', 829031256, 'Contabilista', 'Djonasse', '743', '1968-09-21', 3),
(4, 'Joazin', 'Agustinho Marronga', 'Marrongazip@gmail.com', 871023777, 'Secretaria', 'Luis Cabral', '123', '2000-05-17', 4),
(5, 'Gribi', 'Zilta Txovo', 'Gribizilta@gmail.com', 855557809, 'Desenvolvedor', 'Nkobe', '798', '1993-06-24', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `credenciais`
--
ALTER TABLE `credenciais`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Credenciais_id` (`Credenciais_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `credenciais`
--
ALTER TABLE `credenciais`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD CONSTRAINT `funcionarios_ibfk_1` FOREIGN KEY (`Credenciais_id`) REFERENCES `credenciais` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
