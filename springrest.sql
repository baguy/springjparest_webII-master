-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 02-Dez-2018 às 21:55
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springrest`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cats`
--

CREATE TABLE `cats` (
  `id` bigint(20) NOT NULL,
  `color` varchar(255) NOT NULL,
  `friendly` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cats`
--

INSERT INTO `cats` (`id`, `color`, `friendly`, `name`) VALUES
(1, 'grey', 'yes', 'spock');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clients`
--

CREATE TABLE `clients` (
  `id` bigint(20) NOT NULL,
  `cat` varchar(255) NOT NULL,
  `coffee` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clients`
--

INSERT INTO `clients` (`id`, `cat`, `coffee`, `name`) VALUES
(1, 'spock', 'cappuccino', 'peter parker');

-- --------------------------------------------------------

--
-- Estrutura da tabela `coffees`
--

CREATE TABLE `coffees` (
  `id` bigint(20) NOT NULL,
  `bean` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `coffees`
--

INSERT INTO `coffees` (`id`, `bean`, `name`, `price`) VALUES
(1, 'Coffea arabica', 'cappuccino', '3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `employees`
--

CREATE TABLE `employees` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `designation` varchar(255) NOT NULL,
  `expertise` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `employees`
--

INSERT INTO `employees` (`id`, `created_at`, `designation`, `expertise`, `name`) VALUES
(1, '2018-12-02 00:00:00', 'manager', 'alchemy', 'alphonse elric');

-- --------------------------------------------------------

--
-- Estrutura da tabela `regions`
--

CREATE TABLE `regions` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `regions`
--

INSERT INTO `regions` (`id`, `name`) VALUES
(1, 'tanzania');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cats`
--
ALTER TABLE `cats`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `coffees`
--
ALTER TABLE `coffees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `regions`
--
ALTER TABLE `regions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cats`
--
ALTER TABLE `cats`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `coffees`
--
ALTER TABLE `coffees`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `regions`
--
ALTER TABLE `regions`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
